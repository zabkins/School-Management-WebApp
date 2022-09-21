package pl.zarczynski.smapp.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pl.zarczynski.smapp.domain.security.Account;
import pl.zarczynski.smapp.repository.AccountRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

    private AccountRepository accountRepository;

    public MyUserDetailsService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return new MyUserDetails(account);
    }
}

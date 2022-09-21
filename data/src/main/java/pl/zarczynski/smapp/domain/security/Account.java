package pl.zarczynski.smapp.domain.security;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "account")
@EqualsAndHashCode
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private boolean active;
    @ManyToMany
    @JoinTable(name = "account_authorities",
    joinColumns = @JoinColumn(name = "account_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
    private Set<Authority> authorities;
}

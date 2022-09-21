package pl.zarczynski.smapp.domain.entity;

import lombok.*;
import pl.zarczynski.smapp.domain.security.Account;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastname;
    @OneToOne
    @JoinColumn(name = "account_id")
    @ToString.Exclude
    private Account account;
}

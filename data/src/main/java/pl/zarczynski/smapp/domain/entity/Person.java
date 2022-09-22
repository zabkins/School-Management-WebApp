package pl.zarczynski.smapp.domain.entity;

import lombok.*;
import pl.zarczynski.smapp.domain.security.Account;

import javax.persistence.*;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Person {
    //tu chyba table per class, W MyUserDetails dodam opcje getId
    //wtedy pod sciezka /student wiadomo ze student a np. pod sciezka /teacher wiadomo ze teacher
    //wiec bede pewny ze id ktore wyciagne z SecurityContextHolder bedzie w danej tabeli
    //ALBO OSOBNO KAZDA KLASE I TYLE? :/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastname;
    @OneToOne
    @JoinColumn(name = "account_id")
    @ToString.Exclude
    private Account account;
}

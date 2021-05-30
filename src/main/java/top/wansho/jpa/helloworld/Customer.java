package top.wansho.jpa.helloworld;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * @author wanshuo
 * @date 2021-05-29 14:06:50
 */
@Data
@ToString
@Entity
@Table(name = "JPA_CUSTOMERS")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String lastName;
    private String email;
    private Integer age;
}

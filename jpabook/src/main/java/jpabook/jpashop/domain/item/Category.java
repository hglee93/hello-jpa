package jpabook.jpashop.domain.item;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Category {

    @Id @GeneratedValue
    private Long id;

    private String name;
}

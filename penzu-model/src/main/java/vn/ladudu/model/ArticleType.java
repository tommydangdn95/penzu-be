package vn.ladudu.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ArticleType")
public class ArticleType {
    private Long Id;
    private String Type;
}
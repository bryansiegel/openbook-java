package com.bryansiegel.openbookjava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class CMS {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)

    private Long id;

    @Lob
    private String headerParagraph;

    @Lob
    private String introParagraph;
    private String pageTitle;
    private String metaDescription;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeaderParagraph() {
        return headerParagraph;
    }

    public void setHeaderParagraph(String headerParagraph) {
        this.headerParagraph = headerParagraph;
    }

    public String getIntroParagraph() {
        return introParagraph;
    }

    public void setIntroParagraph(String introParagraph) {
        this.introParagraph = introParagraph;
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public String getMetaDescription() {
        return metaDescription;
    }

    public void setMetaDescription(String metaDescription) {
        this.metaDescription = metaDescription;
    }

    @Override
    public String toString() {
        return "CMS{" +
                "id=" + id +
                ", headerParagraph='" + headerParagraph + '\'' +
                ", introParagraph='" + introParagraph + '\'' +
                ", pageTitle='" + pageTitle + '\'' +
                ", metaDescription='" + metaDescription + '\'' +
                '}';
    }
}

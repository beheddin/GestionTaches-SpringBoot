package com.example.projetfed.Models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Data
@NoArgsConstructor
public class Tache {
    @Id
    @GeneratedValue(strategy =AUTO)
    private Long id;
    private String Titre;
    private  String description;
    private Date dateDebutT;

    private  Long projetID;

    private  Long userID;


    public Tache(Long id, String titre, String description, Date dateDebutT, Long projetID, Long userID) {
        this.id = id;
        this.Titre = titre;
        this.description = description;
        this.dateDebutT = dateDebutT;
        this.projetID = projetID;
        this.userID = userID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return Titre;
    }

    public void setTitre(String titre) {
        Titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateDebutT() {
        return dateDebutT;
    }

    public void setDateDebutT(Date dateDebutT) {
        this.dateDebutT = dateDebutT;
    }

    public Long getProjetID() {
        return projetID;
    }

    public void setProjetID(Long projetID) {
        this.projetID = projetID;
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }
}

package com.angular.formation.restangularformation.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {

    private long id;
    private String name;
    private String pays;
    private String category;
    private String description;
    private Date releaseDate;
    private long upVote;
    private long downVote;

    public Movie() {

    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "pays")
    public String getPays() {
        return pays;
    }
    public void setPays(String pays) {
        this.pays = pays;
    }

    @Column(name = "category")
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "description")
	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "release_date")
	public Date getReleaseDate() {
		return releaseDate;
	}


	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	@Column(name = "up_vote")
	public long getUpVote() {
		return upVote;
	}


	public void setUpVote(long upVote) {
		this.upVote = upVote;
	}

	@Column(name = "down_vote")
	public long getDownVote() {
		return downVote;
	}


	public void setDownVote(long downVote) {
		this.downVote = downVote;
	}

    
}
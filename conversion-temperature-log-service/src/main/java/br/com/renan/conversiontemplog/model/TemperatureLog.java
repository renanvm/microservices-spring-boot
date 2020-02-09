package br.com.renan.conversiontemplog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TemperatureLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String path;
    private Date date;

    public String getPath() {
        return path;
    }

    public void setPath(String name) {
        this.path = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date time) {
        this.date = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}

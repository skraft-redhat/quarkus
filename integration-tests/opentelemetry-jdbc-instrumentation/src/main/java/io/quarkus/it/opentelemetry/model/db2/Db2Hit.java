package io.quarkus.it.opentelemetry.model.db2;

import javax.persistence.Entity;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.it.opentelemetry.model.Hit;

@Entity
public class Db2Hit extends PanacheEntityBase implements Hit {

    @Id
    public Long id;

    public String message;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setMessage(String message) {
        this.message = message;
    }
}

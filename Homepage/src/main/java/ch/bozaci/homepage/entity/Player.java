package ch.bozaci.homepage.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: Player
 */
@Entity
@Table(name = "PLAYER")
public class Player implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "firstname", nullable = false, length = 50)
    private String firstname;
    
    @Column(name = "lastname", nullable = false, length = 50)
    private String lastname;
    
    @Column(name = "position", nullable = false, length = 50)
    private String position;
    
    @Column(name = "number", nullable = false, length = 3)
    private Integer number;
    
    
    public Player()
    {
        super();
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getFirstname()
    {
        return firstname;
    }

    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname = lastname;
    }

    public String getPosition()
    {
        return position;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public Integer getNumber()
    {
        return number;
    }

    public void setNumber(Integer number)
    {
        this.number = number;
    }

}

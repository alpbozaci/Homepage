package ch.bozaci.homepage.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * Entity implementation class for Entity: User
 */
@Entity
@Table(name = "USER")
public class User implements Serializable
{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "firstname", nullable = false, length = 50)
    private String firstname;
    
    @Column(name = "lastname", nullable = false, length = 50)
    private String lastname;
    
    @Column(name = "username", nullable = false, length = 50)
    private String username;
    
    public User()
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

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
    

}

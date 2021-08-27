package modelo;

/**
 *
 * @author Test
 */
public class User {
    /*
    +-------+--------------+------+-----+---------+-------+
    | Field | Type         | Null | Key | Default | Extra |
    +-------+--------------+------+-----+---------+-------+
    | id    | int          | NO   | PRI | NULL    |       |
    | email | varchar(255) | YES  |     | NULL    |       |
    | name  | varchar(255) | YES  |     | NULL    |       |
    +-------+--------------+------+-----+---------+-------+
    */
    private int id;
    private String email;
    private String name;

    public User(int id, String email, String name) {
        this.id = id;
        this.email = email;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

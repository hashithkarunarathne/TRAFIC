package model.db;
// Generated 21-May-2017 23:55:06 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * UserLogin generated by hbm2java
 */
public class UserLogin  implements java.io.Serializable {


     private Integer iduser;
     private User user;
     private Date loggedDatetime;

    public UserLogin() {
    }

	
    public UserLogin(User user) {
        this.user = user;
    }
    public UserLogin(User user, Date loggedDatetime) {
       this.user = user;
       this.loggedDatetime = loggedDatetime;
    }
   
    public Integer getIduser() {
        return this.iduser;
    }
    
    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Date getLoggedDatetime() {
        return this.loggedDatetime;
    }
    
    public void setLoggedDatetime(Date loggedDatetime) {
        this.loggedDatetime = loggedDatetime;
    }




}



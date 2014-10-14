package com.hrdb;
// Generated 14 Oct, 2014 3:13:40 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import javax.persistence.Transient;
import javax.persistence.CascadeType;


/**
 * Employee generated by hbm2java
 */
@Entity
@Table(name="EMPLOYEE"
    ,schema="PUBLIC"
    ,catalog="PUBLIC"
)
public class Employee  implements java.io.Serializable {


     private Integer eid;
     private Department department;
     private Employee employee;
     private String firstname;
     private String lastname;
     private String street;
     private String city;
     private String state;
     private String zip;
     private Date birthdate;
     private String picurl;
     private String twitterid;
     private Integer tenantid;
     private Set<Employee> employees = new HashSet<Employee>(0);
     private Set<Vacation> vacations = new HashSet<Vacation>(0);

    public Employee() {
    }

    public Employee(Department department, Employee employee, String firstname, String lastname, String street, String city, String state, String zip, Date birthdate, String picurl, String twitterid, Integer tenantid, Set<Employee> employees, Set<Vacation> vacations) {
       this.department = department;
       this.employee = employee;
       this.firstname = firstname;
       this.lastname = lastname;
       this.street = street;
       this.city = city;
       this.state = state;
       this.zip = zip;
       this.birthdate = birthdate;
       this.picurl = picurl;
       this.twitterid = twitterid;
       this.tenantid = tenantid;
       this.employees = employees;
       this.vacations = vacations;
    }

     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="EID", unique=true, nullable=false)
    public Integer getEid() {
        return this.eid;
    }
    
    public void setEid(Integer eid) {
        this.eid = eid;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="DEPTID")
    public Department getDepartment() {
        return this.department;
    }
    
    public void setDepartment(Department department) {
        this.department = department;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="MANAGERID")
    public Employee getEmployee() {
        return this.employee;
    }
    
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    
    @Column(name="FIRSTNAME")
    public String getFirstname() {
        return this.firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    
    @Column(name="LASTNAME")
    public String getLastname() {
        return this.lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    
    @Column(name="STREET")
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="CITY")
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="STATE", length=2)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    
    @Column(name="ZIP")
    public String getZip() {
        return this.zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="BIRTHDATE", length=10)
    public Date getBirthdate() {
        return this.birthdate;
    }
    
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    
    @Column(name="PICURL")
    public String getPicurl() {
        return this.picurl;
    }
    
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    
    @Column(name="TWITTERID", length=40)
    public String getTwitterid() {
        return this.twitterid;
    }
    
    public void setTwitterid(String twitterid) {
        this.twitterid = twitterid;
    }

    
    @Column(name="TENANTID")
    public Integer getTenantid() {
        return this.tenantid;
    }
    
    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

@OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="employee")
    public Set<Employee> getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

@OneToMany(fetch=FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="employee")
    public Set<Vacation> getVacations() {
        return this.vacations;
    }
    
    public void setVacations(Set<Vacation> vacations) {
        this.vacations = vacations;
    }




}


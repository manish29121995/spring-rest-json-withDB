package in.ashokit.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="agent_data")
public class Agent {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
private String gender;
private String phn;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPhn() {
	return phn;
}
public void setPhn(String phn) {
	this.phn = phn;
}
@Override
public String toString() {
	return "Agent [id=" + id + ", name=" + name + ", gender=" + gender + ", phn=" + phn + "]";
}



}

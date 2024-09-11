package ExampleFile.File.Model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RoomInfo {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String cityname;
	private String areaname;
	private String types;
	private String deposit;
	private String rent;
	private String contact;
	private String any;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getAreaname() {
		return areaname;
	}
	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}
	public String getTypes() {
		return types;
	}
	public void setTypes(String types) {
		this.types = types;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAny() {
		return any;
	}
	public void setAny(String any) {
		this.any = any;
	}
	@Override
	public String toString() {
		return "RoomInfo [id=" + id + ", cityname=" + cityname + ", areaname=" + areaname + ", types=" + types
				+ ", deposit=" + deposit + ", rent=" + rent + ", contact=" + contact + ", any=" + any + "]";
	}
	public void addAttribute(String string, List<RoomInfo> rooms) {
		// TODO Auto-generated method stub
		
	}

	
}

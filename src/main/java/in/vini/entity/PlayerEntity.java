package in.vini.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table (name="tbl_player")
public class PlayerEntity {
	@Id
	private Integer player_id;
	private String player_name;
	private String player_role;
	public Integer getPlayer_id() {
		return player_id;
	}
	public void setPlayer_id(Integer player_id) {
		this.player_id = player_id;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public String getPlayer_role() {
		return player_role;
	}
	public void setPlayer_role(String player_role) {
		this.player_role = player_role;
	}
	
}

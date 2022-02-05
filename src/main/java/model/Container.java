package model;
import java.util.ArrayList;

//SIMULANDO UM BD
public class Container {

	private ArrayList<User> userList;
	private Integer idSequence;
	
	public Container() {
		super();
		userList = new ArrayList<User>();
		this.idSequence = 1;
	}	
	
	public void inserir(User user) {
		user.setId(idSequence);
		this.userList.add(user);
		this.idSequence++;
	}	
	
	public ArrayList<User> selectAll(){
		return this.userList;
	}
	
	public void apagar(int excluir) {
		for (User u : this.userList) {
			if (u.getId() == excluir) {
				this.userList.remove(u);
				break;
			}
		}
	}
	
	public void alterar(User user) {
		for (User u : this.userList) {
			if (u.getId() == user.getId()) {
				u.setEmail(user.getEmail());
				u.setNome(user.getNome());
				u.setPais(user.getPais());
				break;
			}
		}
	}
	
	public User selectById(Integer id){
		for (User u : this.userList) {
			if (u.getId() == id) {
				return u;
			}
		}
		return null;
	}
	
}

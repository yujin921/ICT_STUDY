package Chapter12.object;

import java.util.Objects;

public class User {
	int userId;
	String userName;
	
	public User(int userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		
		if(this.userId != other.userId) {
			return false;
		}
		return true;
	}
	
	
}

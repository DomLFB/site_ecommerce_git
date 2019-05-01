package com.intiformation.ecommerce.entity;

public class Role {

	/* ################################################################ */
	private Long idRole;
	private String roleName;

	/* ################################################################ */
	public Role() {
		super();
	}

	public Role(Long idRole, String roleName) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
	}

	/* ################################################################ */
	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", roleName=" + roleName + "]";
	}

}

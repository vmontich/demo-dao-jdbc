package model.dao;

import model.dao.impl.SellerDAOJDBC;

public class DaoFactory {
	
	public static SellerDAO createSellerDAO() {
		return new SellerDAOJDBC();
	}

}

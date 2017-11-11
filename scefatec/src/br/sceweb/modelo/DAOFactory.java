package br.sceweb.modelo;
/**
 * Interface com o banco de dados
 * 
 */

public abstract class DAOFactory {

	// List of DAO types supported by the factory
	public static final int CLOUDSCAPE = 1;
	public static final int ORACLE = 2;
	public static final int SYBASE = 3;
	public static final int MYSQL = 4;
	public static final int FILE = 5;
	//Existe um metodo para cada DAO que pode ser criado
	//A fabrica concreta tera que implementar estes metodos
	
	public abstract IConvenioDAO getConvenioDAO();

	public abstract IEmpresaDAO getEmpresaDAO();
	

	public static DAOFactory getDAOFactory(int whichFactory) {

		switch (whichFactory) {
		case CLOUDSCAPE:
			// return new CloudscapeDAOFactory();
		case ORACLE:
			// return new OracleDAOFactory();
		case MYSQL:
			return new MySQLDAOFactory();
		case FILE:
			return new FileDAOFactory();

		default:
			return null;
		}
	}
}
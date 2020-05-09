
package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCarro extends Remote{
    
    public String getModelo() throws RemoteException;
    public void setModelo(String Modelo) throws RemoteException;
    public String getMarca() throws RemoteException;
    public void setMarca(String Marca)throws RemoteException;
    public int getAno()throws RemoteException;
    public void setAno(int Ano)throws RemoteException;
    public String getPlaca() throws RemoteException;
    public void setPlaca(String Placa) throws RemoteException;
    
}

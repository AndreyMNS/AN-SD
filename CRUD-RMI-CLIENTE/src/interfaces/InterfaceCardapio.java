package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCardapio extends Remote{
    
    public String getNomePrato() throws RemoteException;
    public void setNomePrato(String NomePrato) throws RemoteException;
    public String getDescPrato()  throws RemoteException;
    public void setDescPrato(String DescPrato) throws RemoteException;
    public double getPrecoPrato() throws RemoteException;
    public void setPrecoPrato(double PrecoPrato) throws RemoteException;
    public int getQtdPrato() throws RemoteException;
    public void setQtdPrato(int QtdPrato) throws RemoteException;

}

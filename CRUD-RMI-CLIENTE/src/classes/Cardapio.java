package classes;

import Interfaces.InterfaceCardapio;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Cardapio extends UnicastRemoteObject  implements InterfaceCardapio{
    
    public String NomePrato;
    public String DescPrato;
    public double PrecoPrato;
    public int QtdPrato;
    
    public Cardapio() throws RemoteException{
        System.out.println("A classe Cardapio está disponível remotamente.");
    }

    @Override
    public String getNomePrato() {
        return NomePrato;
    }

    @Override
    public void setNomePrato(String NomePrato) {
        this.NomePrato = NomePrato;
    }

    @Override
    public String getDescPrato() {
        return DescPrato;
    }

    @Override
    public void setDescPrato(String DescPrato) {
        this.DescPrato = DescPrato;
    }

    @Override
    public double getPrecoPrato() {
        return PrecoPrato;
    }

    @Override
    public void setPrecoPrato(double PrecoPrato) {
        this.PrecoPrato = PrecoPrato;
    }

    @Override
    public int getQtdPrato() {
        return QtdPrato;
    }

    @Override
    public void setQtdPrato(int QtdPrato) {
        this.QtdPrato = QtdPrato;
    }
    
}

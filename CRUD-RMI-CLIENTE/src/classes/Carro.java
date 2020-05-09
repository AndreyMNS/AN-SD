package classes;

import Interfaces.InterfaceCarro;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Carro extends UnicastRemoteObject implements InterfaceCarro{
    public String Modelo;
    public String Marca;
    public int Ano;
    public String Placa;
    
   public Carro() throws RemoteException {
        System.out.print("A classe Carro está disponível remotamente.");
    }

    @Override
    public String getModelo() {
        return Modelo;
    }

    @Override
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    @Override
    public String getMarca() {
        return Marca;
    }

    @Override
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public int getAno() {
        return Ano;
    }

    @Override
    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    @Override
    public String getPlaca() {
        return Placa;
    }

    @Override
    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }
    
}

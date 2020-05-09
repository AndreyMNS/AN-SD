
package classes;

import Interfaces.InterfaceGame;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Game extends UnicastRemoteObject implements InterfaceGame{
    
    public String NomeGame;
    public String Developer;
    public String Genero;
    
     public Game() throws RemoteException {
        System.out.print("A classe Game está disponível remotamente.");
    }

    @Override
    public String getNomeGame() {
        return NomeGame;
    }

    @Override
    public void setNomeGame(String NomeGame) {
        this.NomeGame = NomeGame;
    }

    @Override
    public String getDeveloper() {
        return Developer;
    }

    @Override
    public void setDeveloper(String Developer) {
        this.Developer = Developer;
    }

    @Override
    public String getGenero() {
        return Genero;
    }

    @Override
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    
}


package Interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceAluno extends Remote{
    
    public String getNomeAluno()  throws RemoteException;
    public void setNomeAluno(String NomeAluno)  throws RemoteException;
    public String getTurma() throws RemoteException;
    public void setTurma(String Turma) throws RemoteException;
    public String getCurso() throws RemoteException;
    public void setCurso(String Curso)  throws RemoteException;
    public int getMatricula() throws RemoteException;
    public void setMatricula(int Matricula) throws RemoteException;
    
}

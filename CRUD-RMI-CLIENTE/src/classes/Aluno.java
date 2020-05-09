package classes;

import Interfaces.InterfaceAluno;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Aluno extends UnicastRemoteObject implements InterfaceAluno{
    
    public String NomeAluno;
    public String Turma;
    public String Curso;
    public int Matricula;
    
    public Aluno() throws RemoteException {
        System.out.print("A classe Aluno está disponível remotamente.");
    }

    @Override
    public String getNomeAluno() {
        return NomeAluno;
    }

    @Override
    public void setNomeAluno(String NomeAluno) {
        this.NomeAluno = NomeAluno;
    }

    @Override
    public String getTurma() {
        return Turma;
    }

    @Override
    public void setTurma(String Turma) {
        this.Turma = Turma;
    }

    @Override
    public String getCurso() {
        return Curso;
    }

    @Override
    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    @Override
    public int getMatricula() {
        return Matricula;
    }

    @Override
    public void setMatricula(int Matricula) {
        this.Matricula = Matricula;
    }
    
}

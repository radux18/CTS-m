package seminar10.Command;

public class TaskToDo extends TaskAsincron {

    InterfataModulJoc modulJoc = null;
    String info;
    int prioritate;

    //trb sa stim cine este executantul(modulul)
    public TaskToDo(InterfataModulJoc modulJoc, String info, int prioritate) {
        this.modulJoc = modulJoc;
        this.info = info;
        this.prioritate = prioritate;
    }

    @Override
    public void executaTask() {
       if (this.modulJoc != null){
           this.modulJoc.executaActiune(info);
       } else {
           throw new UnsupportedOperationException();
       }


    }
}

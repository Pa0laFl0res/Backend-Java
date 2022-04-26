package PracticaOctocat;

class MonaOctocatype {
    private String name = "Mona Lisa";
    private String Outfit = "none";
    private String Task = "Hi,Githubbers!!! Welcome to the best social media code...";

    public MonaOctocatype() {
    }

    public String getname() {  return name;  }
    public String getOutfit() {  return Outfit;  }
    public String getTask() {  return Task;  }

    public boolean setname(String name) {
        if(!name.isEmpty()) {
            this.name = name;
            return true;
        }
        return false;
    }


    public boolean setOutfit(String Outfit) {
        if(!Outfit.isEmpty()) {
            this.Outfit = Outfit;
            return true;
        }
        return false;
    }


    public boolean setTask(String Task
    ) {
        if(!Task.isEmpty()) {
            this.Task = Task;
            return true;
        }
        return false;
    }


    // Metodos
    public void accion() {
        System.out.println("Nice to see u here");
    }


    // Ocerloading del metodo accion()
    public boolean accion(String mensaje) {
        if(!mensaje.isEmpty()) {
            System.out.println(mensaje + "Amaiziiing!!!");
            return true;
        }
        return false;
    }


    public String showMessage() {
        return name +
                "\nOutfit: " + Outfit +
                "\nTask: " + Task;
    }
}



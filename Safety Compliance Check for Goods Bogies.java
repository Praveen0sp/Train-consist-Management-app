class GoodsBogie {
    private String id;
    private String type;
    private String cargo;  
    public GoodsBogie(String id, String type, String cargo) {
        this.id = id;
        this.type = type;
        this.cargo = cargo;
    }
    public String getId() {
        return id;
    }
    public String getType() {
        return type;
    }
    public String getCargo() {
        return cargo;
    }
    @Override
    public String toString() {
        return "[" + id + " - " + type + " - " + cargo + "]";
    }
}

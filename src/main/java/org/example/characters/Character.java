package org.example.characters;

public abstract  class Character{
    private String title;
    private Integer amount;

    public Character(Integer amount) {
        this.amount = amount;
    }
    public String getTitleCharacter(){
        return "This is "+title;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

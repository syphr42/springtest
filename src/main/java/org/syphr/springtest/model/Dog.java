package org.syphr.springtest.model;

import javax.persistence.Entity;

@Entity
public class Dog extends Pet
{
    private boolean floppyEars;

    protected Dog()
    {}

    public Dog(String name, boolean floppyEars)
    {
        super(name);
        this.floppyEars = floppyEars;
    }

    public boolean isFloppyEars()
    {
        return floppyEars;
    }

    public void setFloppyEars(boolean floppyEars)
    {
        this.floppyEars = floppyEars;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Dog [floppyEars=");
        builder.append(floppyEars);
        builder.append(", id=");
        builder.append(getId());
        builder.append(", name=");
        builder.append(getName());
        builder.append("]");
        return builder.toString();
    }
}

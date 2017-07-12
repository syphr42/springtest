package org.syphr.springtest.model;

import javax.persistence.Entity;

@Entity
public class Cat extends Pet
{
    private boolean declawed;

    protected Cat()
    {}

    public Cat(String name, boolean declawed)
    {
        super(name);
        this.declawed = declawed;
    }

    public boolean isDeclawed()
    {
        return declawed;
    }

    public void setDeclawed(boolean declawed)
    {
        this.declawed = declawed;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("Cat [declawed=");
        builder.append(declawed);
        builder.append(", id=");
        builder.append(getId());
        builder.append(", name=");
        builder.append(getName());
        builder.append("]");
        return builder.toString();
    }
}

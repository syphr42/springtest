package org.syphr.springtest.model;

import org.springframework.data.annotation.Id;

public class ColorDTO
{
    @Id
    private String id;

    private Color color;

    public ColorDTO()
    {}

    public ColorDTO(Color color)
    {
        this.color = color;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("FavoriteColor [id=");
        builder.append(id);
        builder.append(", color=");
        builder.append(color);
        builder.append("]");
        return builder.toString();
    }
}

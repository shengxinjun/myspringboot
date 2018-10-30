package com.domain;


import java.io.Serializable;

public class OrderItem implements Serializable {

    private static final long serialVersionUID = -846668837;

    private Integer id;
    private String  imgs;
    private String  description;
    private String  name;
    private Double  price;
    private String  type;
    private Integer orderId;

    public OrderItem() {}

    public OrderItem(OrderItem value) {
        this.id = value.id;
        this.imgs = value.imgs;
        this.description = value.description;
        this.name = value.name;
        this.price = value.price;
        this.type = value.type;
        this.orderId = value.orderId;
    }

    public OrderItem(
        Integer id,
        String  imgs,
        String  description,
        String  name,
        Double  price,
        String  type,
        Integer orderId
    ) {
        this.id = id;
        this.imgs = imgs;
        this.description = description;
        this.name = name;
        this.price = price;
        this.type = type;
        this.orderId = orderId;
    }

    public Integer getId() {
        return this.id;
    }

    public OrderItem setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getImgs() {
        return this.imgs;
    }

    public OrderItem setImgs(String imgs) {
        this.imgs = imgs;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public OrderItem setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public OrderItem setName(String name) {
        this.name = name;
        return this;
    }

    public Double getPrice() {
        return this.price;
    }

    public OrderItem setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public OrderItem setType(String type) {
        this.type = type;
        return this;
    }

    public Integer getOrderId() {
        return this.orderId;
    }

    public OrderItem setOrderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final OrderItem other = (OrderItem) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (imgs == null) {
            if (other.imgs != null)
                return false;
        }
        else if (!imgs.equals(other.imgs))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (price == null) {
            if (other.price != null)
                return false;
        }
        else if (!price.equals(other.price))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        }
        else if (!type.equals(other.type))
            return false;
        if (orderId == null) {
            if (other.orderId != null)
                return false;
        }
        else if (!orderId.equals(other.orderId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((imgs == null) ? 0 : imgs.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((price == null) ? 0 : price.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OrderItem (");

        sb.append(id);
        sb.append(", ").append(imgs);
        sb.append(", ").append(description);
        sb.append(", ").append(name);
        sb.append(", ").append(price);
        sb.append(", ").append(type);
        sb.append(", ").append(orderId);

        sb.append(")");
        return sb.toString();
    }
}

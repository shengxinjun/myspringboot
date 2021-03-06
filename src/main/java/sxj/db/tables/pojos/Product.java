/**
 * This class is generated by jOOQ
 */
package sxj.db.tables.pojos;


import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Product implements Serializable {

    private static final long serialVersionUID = -1771472568;

    private Integer id;
    private String  imgs;
    private String  description;
    private String  name;
    private Double  price;
    private Date    updateDate;
    private Date    createDate;
    private Integer deleted;
    private String  type;

    public Product() {}

    public Product(Product value) {
        this.id = value.id;
        this.imgs = value.imgs;
        this.description = value.description;
        this.name = value.name;
        this.price = value.price;
        this.updateDate = value.updateDate;
        this.createDate = value.createDate;
        this.deleted = value.deleted;
        this.type = value.type;
    }

    public Product(
        Integer id,
        String  imgs,
        String  description,
        String  name,
        Double  price,
        Date    updateDate,
        Date    createDate,
        Integer deleted,
        String  type
    ) {
        this.id = id;
        this.imgs = imgs;
        this.description = description;
        this.name = name;
        this.price = price;
        this.updateDate = updateDate;
        this.createDate = createDate;
        this.deleted = deleted;
        this.type = type;
    }

    public Integer getId() {
        return this.id;
    }

    public Product setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getImgs() {
        return this.imgs;
    }

    public Product setImgs(String imgs) {
        this.imgs = imgs;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Double getPrice() {
        return this.price;
    }

    public Product setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Date getUpdateDate() {
        return this.updateDate;
    }

    public Product setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
        return this;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public Product setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public Integer getDeleted() {
        return this.deleted;
    }

    public Product setDeleted(Integer deleted) {
        this.deleted = deleted;
        return this;
    }

    public String getType() {
        return this.type;
    }

    public Product setType(String type) {
        this.type = type;
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
        final Product other = (Product) obj;
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
        if (updateDate == null) {
            if (other.updateDate != null)
                return false;
        }
        else if (!updateDate.equals(other.updateDate))
            return false;
        if (createDate == null) {
            if (other.createDate != null)
                return false;
        }
        else if (!createDate.equals(other.createDate))
            return false;
        if (deleted == null) {
            if (other.deleted != null)
                return false;
        }
        else if (!deleted.equals(other.deleted))
            return false;
        if (type == null) {
            if (other.type != null)
                return false;
        }
        else if (!type.equals(other.type))
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
        result = prime * result + ((updateDate == null) ? 0 : updateDate.hashCode());
        result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
        result = prime * result + ((deleted == null) ? 0 : deleted.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Product (");

        sb.append(id);
        sb.append(", ").append(imgs);
        sb.append(", ").append(description);
        sb.append(", ").append(name);
        sb.append(", ").append(price);
        sb.append(", ").append(updateDate);
        sb.append(", ").append(createDate);
        sb.append(", ").append(deleted);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}

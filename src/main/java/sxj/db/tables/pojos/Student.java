/**
 * This class is generated by jOOQ
 */
package sxj.db.tables.pojos;


import java.io.Serializable;

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
public class Student implements Serializable {

    private static final long serialVersionUID = -1900476281;

    private Integer id;
    private String  number;
    private String  name;
    private Integer clazzId;

    public Student() {}

    public Student(Student value) {
        this.id = value.id;
        this.number = value.number;
        this.name = value.name;
        this.clazzId = value.clazzId;
    }

    public Student(
        Integer id,
        String  number,
        String  name,
        Integer clazzId
    ) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.clazzId = clazzId;
    }

    public Integer getId() {
        return this.id;
    }

    public Student setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNumber() {
        return this.number;
    }

    public Student setNumber(String number) {
        this.number = number;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getClazzId() {
        return this.clazzId;
    }

    public Student setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
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
        final Student other = (Student) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (number == null) {
            if (other.number != null)
                return false;
        }
        else if (!number.equals(other.number))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (clazzId == null) {
            if (other.clazzId != null)
                return false;
        }
        else if (!clazzId.equals(other.clazzId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((clazzId == null) ? 0 : clazzId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Student (");

        sb.append(id);
        sb.append(", ").append(number);
        sb.append(", ").append(name);
        sb.append(", ").append(clazzId);

        sb.append(")");
        return sb.toString();
    }
}

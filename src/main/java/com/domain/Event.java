package com.domain;
import java.io.Serializable;

public class Event implements Serializable {

    private static final long serialVersionUID = 304495712;

    private Integer id;
    private String  title;
    private String  start;
    private String  end;
    private String  className;
    private Integer userId;

    public Event() {}

    public Event(Event value) {
        this.id = value.id;
        this.title = value.title;
        this.start = value.start;
        this.end = value.end;
        this.className = value.className;
        this.userId = value.userId;
    }

    public Event(
        Integer id,
        String  title,
        String  start,
        String  end,
        String  className,
        Integer userId
    ) {
        this.id = id;
        this.title = title;
        this.start = start;
        this.end = end;
        this.className = className;
        this.userId = userId;
    }

    public Integer getId() {
        return this.id;
    }

    public Event setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public Event setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getStart() {
        return this.start;
    }

    public Event setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return this.end;
    }

    public Event setEnd(String end) {
        this.end = end;
        return this;
    }

    public String getClassName() {
        return this.className;
    }

    public Event setClassName(String className) {
        this.className = className;
        return this;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public Event setUserId(Integer userId) {
        this.userId = userId;
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
        final Event other = (Event) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        }
        else if (!title.equals(other.title))
            return false;
        if (start == null) {
            if (other.start != null)
                return false;
        }
        else if (!start.equals(other.start))
            return false;
        if (end == null) {
            if (other.end != null)
                return false;
        }
        else if (!end.equals(other.end))
            return false;
        if (className == null) {
            if (other.className != null)
                return false;
        }
        else if (!className.equals(other.className))
            return false;
        if (userId == null) {
            if (other.userId != null)
                return false;
        }
        else if (!userId.equals(other.userId))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((start == null) ? 0 : start.hashCode());
        result = prime * result + ((end == null) ? 0 : end.hashCode());
        result = prime * result + ((className == null) ? 0 : className.hashCode());
        result = prime * result + ((userId == null) ? 0 : userId.hashCode());
        return result;
    }

	@Override
	public String toString() {
		return "Event [id=" + id + ", title=" + title + ", start=" + start + ", end=" + end + ", className=" + className
				+ ", userId=" + userId + "]";
	}

	
   
}

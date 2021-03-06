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
public class Problem implements Serializable {

    private static final long serialVersionUID = -1575061664;

    private Integer id;
    private String  name;
    private Double  score;
    private Integer courseId;
    private Integer studentId;
    private Integer questionId;
    private Double  weight;

    public Problem() {}

    public Problem(Problem value) {
        this.id = value.id;
        this.name = value.name;
        this.score = value.score;
        this.courseId = value.courseId;
        this.studentId = value.studentId;
        this.questionId = value.questionId;
        this.weight = value.weight;
    }

    public Problem(
        Integer id,
        String  name,
        Double  score,
        Integer courseId,
        Integer studentId,
        Integer questionId,
        Double  weight
    ) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.courseId = courseId;
        this.studentId = studentId;
        this.questionId = questionId;
        this.weight = weight;
    }

    public Integer getId() {
        return this.id;
    }

    public Problem setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public Problem setName(String name) {
        this.name = name;
        return this;
    }

    public Double getScore() {
        return this.score;
    }

    public Problem setScore(Double score) {
        this.score = score;
        return this;
    }

    public Integer getCourseId() {
        return this.courseId;
    }

    public Problem setCourseId(Integer courseId) {
        this.courseId = courseId;
        return this;
    }

    public Integer getStudentId() {
        return this.studentId;
    }

    public Problem setStudentId(Integer studentId) {
        this.studentId = studentId;
        return this;
    }

    public Integer getQuestionId() {
        return this.questionId;
    }

    public Problem setQuestionId(Integer questionId) {
        this.questionId = questionId;
        return this;
    }

    public Double getWeight() {
        return this.weight;
    }

    public Problem setWeight(Double weight) {
        this.weight = weight;
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
        final Problem other = (Problem) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (score == null) {
            if (other.score != null)
                return false;
        }
        else if (!score.equals(other.score))
            return false;
        if (courseId == null) {
            if (other.courseId != null)
                return false;
        }
        else if (!courseId.equals(other.courseId))
            return false;
        if (studentId == null) {
            if (other.studentId != null)
                return false;
        }
        else if (!studentId.equals(other.studentId))
            return false;
        if (questionId == null) {
            if (other.questionId != null)
                return false;
        }
        else if (!questionId.equals(other.questionId))
            return false;
        if (weight == null) {
            if (other.weight != null)
                return false;
        }
        else if (!weight.equals(other.weight))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((score == null) ? 0 : score.hashCode());
        result = prime * result + ((courseId == null) ? 0 : courseId.hashCode());
        result = prime * result + ((studentId == null) ? 0 : studentId.hashCode());
        result = prime * result + ((questionId == null) ? 0 : questionId.hashCode());
        result = prime * result + ((weight == null) ? 0 : weight.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Problem (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(score);
        sb.append(", ").append(courseId);
        sb.append(", ").append(studentId);
        sb.append(", ").append(questionId);
        sb.append(", ").append(weight);

        sb.append(")");
        return sb.toString();
    }
}

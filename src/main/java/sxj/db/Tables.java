/**
 * This class is generated by jOOQ
 */
package sxj.db;


import javax.annotation.Generated;

import sxj.db.tables.Clazz;
import sxj.db.tables.CodeMessage;
import sxj.db.tables.Course;
import sxj.db.tables.EmailInfo;
import sxj.db.tables.Event;
import sxj.db.tables.ExamCon;
import sxj.db.tables.File;
import sxj.db.tables.Order;
import sxj.db.tables.OrderItem;
import sxj.db.tables.Problem;
import sxj.db.tables.Product;
import sxj.db.tables.Question;
import sxj.db.tables.Student;
import sxj.db.tables.User;


/**
 * Convenience access to all tables in test
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>test.clazz</code>.
     */
    public static final Clazz CLAZZ = sxj.db.tables.Clazz.CLAZZ;

    /**
     * The table <code>test.code_message</code>.
     */
    public static final CodeMessage CODE_MESSAGE = sxj.db.tables.CodeMessage.CODE_MESSAGE;

    /**
     * The table <code>test.course</code>.
     */
    public static final Course COURSE = sxj.db.tables.Course.COURSE;

    /**
     * The table <code>test.email_info</code>.
     */
    public static final EmailInfo EMAIL_INFO = sxj.db.tables.EmailInfo.EMAIL_INFO;

    /**
     * The table <code>test.event</code>.
     */
    public static final Event EVENT = sxj.db.tables.Event.EVENT;

    /**
     * The table <code>test.exam_con</code>.
     */
    public static final ExamCon EXAM_CON = sxj.db.tables.ExamCon.EXAM_CON;

    /**
     * The table <code>test.file</code>.
     */
    public static final File FILE = sxj.db.tables.File.FILE;

    /**
     * The table <code>test.order</code>.
     */
    public static final Order ORDER = sxj.db.tables.Order.ORDER;

    /**
     * The table <code>test.order_item</code>.
     */
    public static final OrderItem ORDER_ITEM = sxj.db.tables.OrderItem.ORDER_ITEM;

    /**
     * The table <code>test.problem</code>.
     */
    public static final Problem PROBLEM = sxj.db.tables.Problem.PROBLEM;

    /**
     * The table <code>test.product</code>.
     */
    public static final Product PRODUCT = sxj.db.tables.Product.PRODUCT;

    /**
     * The table <code>test.question</code>.
     */
    public static final Question QUESTION = sxj.db.tables.Question.QUESTION;

    /**
     * The table <code>test.student</code>.
     */
    public static final Student STUDENT = sxj.db.tables.Student.STUDENT;

    /**
     * The table <code>test.user</code>.
     */
    public static final User USER = sxj.db.tables.User.USER;
}

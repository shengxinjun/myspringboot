/**
 * This class is generated by jOOQ
 */
package sxj.db;


import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

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
import sxj.db.tables.records.ClazzRecord;
import sxj.db.tables.records.CodeMessageRecord;
import sxj.db.tables.records.CourseRecord;
import sxj.db.tables.records.EmailInfoRecord;
import sxj.db.tables.records.EventRecord;
import sxj.db.tables.records.ExamConRecord;
import sxj.db.tables.records.FileRecord;
import sxj.db.tables.records.OrderItemRecord;
import sxj.db.tables.records.OrderRecord;
import sxj.db.tables.records.ProblemRecord;
import sxj.db.tables.records.ProductRecord;
import sxj.db.tables.records.QuestionRecord;
import sxj.db.tables.records.StudentRecord;
import sxj.db.tables.records.UserRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>test</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<ClazzRecord, Integer> IDENTITY_CLAZZ = Identities0.IDENTITY_CLAZZ;
    public static final Identity<CourseRecord, Integer> IDENTITY_COURSE = Identities0.IDENTITY_COURSE;
    public static final Identity<EmailInfoRecord, Integer> IDENTITY_EMAIL_INFO = Identities0.IDENTITY_EMAIL_INFO;
    public static final Identity<EventRecord, Integer> IDENTITY_EVENT = Identities0.IDENTITY_EVENT;
    public static final Identity<FileRecord, Integer> IDENTITY_FILE = Identities0.IDENTITY_FILE;
    public static final Identity<OrderRecord, Integer> IDENTITY_ORDER = Identities0.IDENTITY_ORDER;
    public static final Identity<OrderItemRecord, Integer> IDENTITY_ORDER_ITEM = Identities0.IDENTITY_ORDER_ITEM;
    public static final Identity<ProblemRecord, Integer> IDENTITY_PROBLEM = Identities0.IDENTITY_PROBLEM;
    public static final Identity<ProductRecord, Integer> IDENTITY_PRODUCT = Identities0.IDENTITY_PRODUCT;
    public static final Identity<QuestionRecord, Integer> IDENTITY_QUESTION = Identities0.IDENTITY_QUESTION;
    public static final Identity<StudentRecord, Integer> IDENTITY_STUDENT = Identities0.IDENTITY_STUDENT;
    public static final Identity<UserRecord, Integer> IDENTITY_USER = Identities0.IDENTITY_USER;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<ClazzRecord> KEY_CLAZZ_PRIMARY = UniqueKeys0.KEY_CLAZZ_PRIMARY;
    public static final UniqueKey<CodeMessageRecord> KEY_CODE_MESSAGE_PRIMARY = UniqueKeys0.KEY_CODE_MESSAGE_PRIMARY;
    public static final UniqueKey<CourseRecord> KEY_COURSE_PRIMARY = UniqueKeys0.KEY_COURSE_PRIMARY;
    public static final UniqueKey<EmailInfoRecord> KEY_EMAIL_INFO_PRIMARY = UniqueKeys0.KEY_EMAIL_INFO_PRIMARY;
    public static final UniqueKey<EventRecord> KEY_EVENT_PRIMARY = UniqueKeys0.KEY_EVENT_PRIMARY;
    public static final UniqueKey<ExamConRecord> KEY_EXAM_CON_PRIMARY = UniqueKeys0.KEY_EXAM_CON_PRIMARY;
    public static final UniqueKey<FileRecord> KEY_FILE_PRIMARY = UniqueKeys0.KEY_FILE_PRIMARY;
    public static final UniqueKey<OrderRecord> KEY_ORDER_PRIMARY = UniqueKeys0.KEY_ORDER_PRIMARY;
    public static final UniqueKey<OrderItemRecord> KEY_ORDER_ITEM_PRIMARY = UniqueKeys0.KEY_ORDER_ITEM_PRIMARY;
    public static final UniqueKey<ProblemRecord> KEY_PROBLEM_PRIMARY = UniqueKeys0.KEY_PROBLEM_PRIMARY;
    public static final UniqueKey<ProductRecord> KEY_PRODUCT_PRIMARY = UniqueKeys0.KEY_PRODUCT_PRIMARY;
    public static final UniqueKey<QuestionRecord> KEY_QUESTION_PRIMARY = UniqueKeys0.KEY_QUESTION_PRIMARY;
    public static final UniqueKey<StudentRecord> KEY_STUDENT_PRIMARY = UniqueKeys0.KEY_STUDENT_PRIMARY;
    public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = UniqueKeys0.KEY_USER_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<ClazzRecord, Integer> IDENTITY_CLAZZ = createIdentity(Clazz.CLAZZ, Clazz.CLAZZ.ID);
        public static Identity<CourseRecord, Integer> IDENTITY_COURSE = createIdentity(Course.COURSE, Course.COURSE.ID);
        public static Identity<EmailInfoRecord, Integer> IDENTITY_EMAIL_INFO = createIdentity(EmailInfo.EMAIL_INFO, EmailInfo.EMAIL_INFO.ID);
        public static Identity<EventRecord, Integer> IDENTITY_EVENT = createIdentity(Event.EVENT, Event.EVENT.ID);
        public static Identity<FileRecord, Integer> IDENTITY_FILE = createIdentity(File.FILE, File.FILE.ID);
        public static Identity<OrderRecord, Integer> IDENTITY_ORDER = createIdentity(Order.ORDER, Order.ORDER.ID);
        public static Identity<OrderItemRecord, Integer> IDENTITY_ORDER_ITEM = createIdentity(OrderItem.ORDER_ITEM, OrderItem.ORDER_ITEM.ID);
        public static Identity<ProblemRecord, Integer> IDENTITY_PROBLEM = createIdentity(Problem.PROBLEM, Problem.PROBLEM.ID);
        public static Identity<ProductRecord, Integer> IDENTITY_PRODUCT = createIdentity(Product.PRODUCT, Product.PRODUCT.ID);
        public static Identity<QuestionRecord, Integer> IDENTITY_QUESTION = createIdentity(Question.QUESTION, Question.QUESTION.ID);
        public static Identity<StudentRecord, Integer> IDENTITY_STUDENT = createIdentity(Student.STUDENT, Student.STUDENT.ID);
        public static Identity<UserRecord, Integer> IDENTITY_USER = createIdentity(User.USER, User.USER.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<ClazzRecord> KEY_CLAZZ_PRIMARY = createUniqueKey(Clazz.CLAZZ, "KEY_clazz_PRIMARY", Clazz.CLAZZ.ID);
        public static final UniqueKey<CodeMessageRecord> KEY_CODE_MESSAGE_PRIMARY = createUniqueKey(CodeMessage.CODE_MESSAGE, "KEY_code_message_PRIMARY", CodeMessage.CODE_MESSAGE.CODE);
        public static final UniqueKey<CourseRecord> KEY_COURSE_PRIMARY = createUniqueKey(Course.COURSE, "KEY_course_PRIMARY", Course.COURSE.ID);
        public static final UniqueKey<EmailInfoRecord> KEY_EMAIL_INFO_PRIMARY = createUniqueKey(EmailInfo.EMAIL_INFO, "KEY_email_info_PRIMARY", EmailInfo.EMAIL_INFO.ID);
        public static final UniqueKey<EventRecord> KEY_EVENT_PRIMARY = createUniqueKey(Event.EVENT, "KEY_event_PRIMARY", Event.EVENT.ID);
        public static final UniqueKey<ExamConRecord> KEY_EXAM_CON_PRIMARY = createUniqueKey(ExamCon.EXAM_CON, "KEY_exam_con_PRIMARY", ExamCon.EXAM_CON.EID);
        public static final UniqueKey<FileRecord> KEY_FILE_PRIMARY = createUniqueKey(File.FILE, "KEY_file_PRIMARY", File.FILE.ID);
        public static final UniqueKey<OrderRecord> KEY_ORDER_PRIMARY = createUniqueKey(Order.ORDER, "KEY_order_PRIMARY", Order.ORDER.ID);
        public static final UniqueKey<OrderItemRecord> KEY_ORDER_ITEM_PRIMARY = createUniqueKey(OrderItem.ORDER_ITEM, "KEY_order_item_PRIMARY", OrderItem.ORDER_ITEM.ID);
        public static final UniqueKey<ProblemRecord> KEY_PROBLEM_PRIMARY = createUniqueKey(Problem.PROBLEM, "KEY_problem_PRIMARY", Problem.PROBLEM.ID);
        public static final UniqueKey<ProductRecord> KEY_PRODUCT_PRIMARY = createUniqueKey(Product.PRODUCT, "KEY_product_PRIMARY", Product.PRODUCT.ID);
        public static final UniqueKey<QuestionRecord> KEY_QUESTION_PRIMARY = createUniqueKey(Question.QUESTION, "KEY_question_PRIMARY", Question.QUESTION.ID);
        public static final UniqueKey<StudentRecord> KEY_STUDENT_PRIMARY = createUniqueKey(Student.STUDENT, "KEY_student_PRIMARY", Student.STUDENT.ID);
        public static final UniqueKey<UserRecord> KEY_USER_PRIMARY = createUniqueKey(User.USER, "KEY_user_PRIMARY", User.USER.ID);
    }
}

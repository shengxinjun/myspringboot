/**
 * This class is generated by jOOQ
 */
package sxj.db.tables.daos;


import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sxj.db.tables.File;
import sxj.db.tables.records.FileRecord;


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
@Repository
public class FileDao extends DAOImpl<FileRecord, sxj.db.tables.pojos.File, Integer> {

    /**
     * Create a new FileDao without any configuration
     */
    public FileDao() {
        super(File.FILE, sxj.db.tables.pojos.File.class);
    }

    /**
     * Create a new FileDao with an attached configuration
     */
    @Autowired
    public FileDao(Configuration configuration) {
        super(File.FILE, sxj.db.tables.pojos.File.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(sxj.db.tables.pojos.File object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<sxj.db.tables.pojos.File> fetchById(Integer... values) {
        return fetch(File.FILE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public sxj.db.tables.pojos.File fetchOneById(Integer value) {
        return fetchOne(File.FILE.ID, value);
    }

    /**
     * Fetch records that have <code>file_name IN (values)</code>
     */
    public List<sxj.db.tables.pojos.File> fetchByFileName(String... values) {
        return fetch(File.FILE.FILE_NAME, values);
    }

    /**
     * Fetch records that have <code>file_url IN (values)</code>
     */
    public List<sxj.db.tables.pojos.File> fetchByFileUrl(String... values) {
        return fetch(File.FILE.FILE_URL, values);
    }

    /**
     * Fetch records that have <code>source IN (values)</code>
     */
    public List<sxj.db.tables.pojos.File> fetchBySource(Integer... values) {
        return fetch(File.FILE.SOURCE, values);
    }

    /**
     * Fetch records that have <code>source_id IN (values)</code>
     */
    public List<sxj.db.tables.pojos.File> fetchBySourceId(Integer... values) {
        return fetch(File.FILE.SOURCE_ID, values);
    }
}
package net.rodrigocarvalho.licenseserver.dao;

import net.rodrigocarvalho.licenseserver.factory.License;
import org.springframework.data.repository.CrudRepository;

public interface LicenseDao extends CrudRepository<License, Long>  {

}
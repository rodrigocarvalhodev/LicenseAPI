package net.rodrigocarvalho.licenseserver.endpoint;

import net.rodrigocarvalho.licenseserver.dao.LicenseDao;
import net.rodrigocarvalho.licenseserver.exception.ResourceNotFoundException;
import net.rodrigocarvalho.licenseserver.factory.License;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("license")
public class LicenseEndpoint {

    private LicenseDao dao;

    @Autowired
    public LicenseEndpoint(LicenseDao dao) {
        this.dao = dao;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getLicenseById(@PathVariable("id") Long id) {
        checkIfExists(id);
        License license = dao.findById(id).orElse(null);
        return new ResponseEntity<>(license, HttpStatus.OK);
    }

    private void checkIfExists(Long id) {
        if (!dao.findById(id).isPresent())
            throw new ResourceNotFoundException("License not found with ID: " + id);
    }
}
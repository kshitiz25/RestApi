package com.thinkconstructive.rest_demo.controller;

import com.thinkconstructive.rest_demo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorApiService {
    CloudVendor cloudVendor;
    @GetMapping("{VendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId){
        return cloudVendor;
//       return new CloudVendor("C1","Vendor 1","Address 1","xxxx");
    }
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
this.cloudVendor = cloudVendor;
return "cloud vendor created successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = cloudVendor;
        return "cloud vendor updated successfully";
    }
    @DeleteMapping ("{vendorId}")
    public String deleteCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor = null;
        return "cloud vendor deleted successfully";
    }
}

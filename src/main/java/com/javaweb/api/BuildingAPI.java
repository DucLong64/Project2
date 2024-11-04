package com.javaweb.api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.Model.BuildingDTO;
import com.javaweb.Model.ErrorResponseDTO;
import com.javaweb.service.BuildingService;

import customeException.FieldRequiredException;

@RestController
public class BuildingAPI {
	@Autowired
	private BuildingService buildingService;
	@GetMapping(value="/api/building/")
	public List<BuildingDTO> getBuilding(@RequestParam(name="name", required = false) String name,
										@RequestParam(value= "districtId", required = false) Long district) {
		List<BuildingDTO> result = buildingService.findAll(name, district);
		return result;
	}

	@DeleteMapping(value="/api/building/{id}/{name}/")
	public void deleteBuilding(@PathVariable Integer id,
								@PathVariable String name ,
								@RequestParam(value="ward",required = false) String ward) {
		System.out.print("Da xoa toa nha id la "+id+ "ten la "+name);
	}

}

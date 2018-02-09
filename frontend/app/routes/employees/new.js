import Route from '@ember/routing/route';
import RSVP from 'rsvp';

export default Route.extend({
  model() {
    return RSVP.hash({
      reportToEmployees: this.get('store').findAll('employee'),
      employee: this.get('store').createRecord('employee'),
      departments: this.get('store').findAll('department'),
      projects: this.get('store').findAll('project'),
      roles: this.get('store').findAll('role'),
      locations: this.get('store').findAll('location'),
      skills: this.get('store').findAll('skill')
    });

  },
  setupController(controller, model) {
    this._super(controller, model);
    controller.set('employee', model.employee);
    let employeeList = [];
    model.reportToEmployees.forEach(function (reportToEmployee) {
      if(reportToEmployee.get('firstName')!=null){
        employeeList.push(reportToEmployee.get('firstName'));
      }
    });
    controller.set('employeeList', employeeList);
    let departmentList = [];
    model.departments.forEach(function (department) {
      departmentList.push(department.get('name'))
    });
    controller.set('departmentList',departmentList);
    let projectList = [];
    model.projects.forEach(function (project) {
      projectList.push(project.get('name'))
    });
    controller.set('projectList',projectList);
    let roleList = [];
    model.roles.forEach(function (role) {
      roleList.push(role.get('name'))
    });
    controller.set('roleList',roleList);
    let locationList = [];
    model.locations.forEach(function (location) {
      locationList.push(location.get('name'))
    });
    controller.set('locationList',locationList);
    let skillList = [];
    model.skills.forEach(function (skill) {
      skillList.push(skill.get('name'))
    });
    controller.set('skillList',skillList);
  }
});

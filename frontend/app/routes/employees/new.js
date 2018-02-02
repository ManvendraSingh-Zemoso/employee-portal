import Route from '@ember/routing/route';
import RSVP from 'rsvp';

export default Route.extend({
  model() {
    return RSVP.hash({
      employee: this.get('store').createRecord('employee'),
      reportToEmployees: this.get('store').findAll('employee')
    });

  },
  setupController(controller, model) {
    this._super(controller, model);
    controller.set('employee', model.employee);
    controller.set('reportToEmployees', model.reportToEmployees.get('firstName'));
    // let employees = [];
    // model.reportToEmployees.forEach(function (reportToEmployee) {
    //   employees.push(reportToEmployee.get('firstName'));
    // });
    // controller.set('employees', employees);
  }
});

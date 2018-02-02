import Controller from '@ember/controller';

export default Controller.extend({
  actions:{
    addEmployee(){
      this.transitionToRoute('employees.new');
    }
  }
});

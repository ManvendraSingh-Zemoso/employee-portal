import Controller from '@ember/controller';

export default Controller.extend({
  actions:{
    addEmployee(){
      this.transitionToRoute('employees.new');
    },
    openDetails(param){
      this.transitionToRoute('employees.details',param);
    }
  }
});

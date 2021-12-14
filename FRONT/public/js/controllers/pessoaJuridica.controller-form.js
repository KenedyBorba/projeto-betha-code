(function () {
    "use strict";

    angular
        .module("MyApp")
        .controller("PessoaJuridicaFormController", PessoaJuridicaFormController);

    PessoaJuridicaFormController.$inject = [
        "PessoaJuridicaService",
        "$location",
        "$routeParams",
        "$scope",
    ];

    function PessoaJuridicaFormController(
        PessoaJuridicaService,
        $location,
        $routeParams
    ) {
        var vm = this;
        vm.cadastro = {};
        vm.titulo = "Nova Pessoa Juridica";
        vm.item = null;
        vm.salvar = salvar;
        vm.select = select;

        activate();

        function activate() {
            if ($routeParams.id) {
                PessoaJuridicaService.findById($routeParams.id).success(function (data) {
                    vm.cadastro = data;
                    vm.titulo = "Editando Pessoa Juridica";
                });
            }
        }
        
        function salvar() {
            PessoaJuridicaService.save(vm.cadastro).success(function () {
                $location.path("/pessoa-juridica");
                alert("Pessoa Juridica cadastrada com sucesso!!");
            }).error(function (erro) {
                alert(JSON.stringify(erro));
            });
        }

        //excluir não esta funcionando
        function select(valor){
            return '"'+valor+'"';
        }
    }
})();